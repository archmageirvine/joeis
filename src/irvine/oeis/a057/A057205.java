package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.io.StreamProcessor;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;

/**
 * A057205 Primes congruent to 3 modulo 4 generated recursively: <code>a(n) = Min{p</code>, prime; <code>Mod[p,4]=3; p|4Q-1}</code>, where Q is the product of all previous terms in the sequence. The initial term is 3.
 * @author Sean A. Irvine
 */
public class A057205 implements Sequence {

  private final List<String> mLines;
  {
    final String name = getClass().getName().toLowerCase(Locale.getDefault());
    try (final InputStream is = new BufferedInputStream(A057205.class.getClassLoader().getResourceAsStream("irvine/factor/project/oeis/" + name.substring(name.lastIndexOf('.') + 1)))) {
      mLines = StreamProcessor.list(is);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
  protected Z mProduct = Z.ONE;
  private int mN = -1;

  protected boolean checkProduct(final String factors) {
    Z first = null;
    Z n = getCandidate();
    for (final String f : factors.split("\\.")) {
      if (f.startsWith("P")) {
        if (!n.isProbablePrime()) {
          return false;
        }
        final int len = Integer.parseInt(f.substring(1));
        return len == n.toString().length();
      }
      if (f.startsWith("C")) {
        if (n.isProbablePrime()) {
          return false;
        }
        final int len = Integer.parseInt(f.substring(1));
        return len == n.toString().length();
      }
      final Z p = new Z(f);
      if (!p.isProbablePrime()) {
        return false;
      }
      if (!Z.ZERO.equals(n.mod(p))) {
        return false;
      }
      // Checks the ordering constraint
      if (first == null) {
        if (p.mod(4) != 3) {
          return false;
        }
        first = p;
      } else {
        if (p.mod(4) == 3 && p.compareTo(first) < 0) {
          return false;
        }
      }
      n = n.divide(p);
    }
    return Z.ONE.equals(n);
  }

  protected void updateProduct(final Z res) {
    mProduct = mProduct.multiply(res);
  }

  protected Z getCandidate() {
    return mProduct.shiftLeft(2).subtract(1);
  }

  @Override
  public Z next() {
    if (++mN >= mLines.size()) {
      throw new UnsupportedOperationException("Next number to factor: " + getCandidate());
    }
    // Assume line has valid format, almost certainly will get exception if this is not so
    final String line = mLines.get(mN);
    final int sp = line.indexOf(' ');
    if (mN != Integer.parseInt(line.substring(0, sp)) - 1 || (mN > 0 && !checkProduct(line.substring(sp + 1)))) {
      throw new RuntimeException("Invalid: " + line);
    }
    final int dot = line.indexOf('.', sp);
    final Z res = new Z(line.substring(sp + 1, dot >= 0 ? dot : line.length()));
    updateProduct(res);
    return res;
  }

}
