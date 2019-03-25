package irvine.factor.util;

import irvine.factor.factor.CachedFactorizer;
import irvine.factor.factor.Cheetah;
import irvine.factor.factor.FactorDbFactorizer;
import irvine.factor.factor.Factorizer;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Sircon;
import irvine.math.z.Z;

/**
 * Attempt to build the home prime sequence for a number. Backed by
 * <code>factordb.com</code>.
 *
 * @author Sean A. Irvine
 */
public class HomePrimeSequence {

  private final Cheetah mCheetah = new Cheetah(false);
  private final Factorizer mFactorizer = new CachedFactorizer(new FactorDbFactorizer());
  private final int mBase;

  HomePrimeSequence(final int base) {
    mBase = base;
  }

  private Z next(final FactorSequence fs) {
    final StringBuilder sb = new StringBuilder();
    for (final Z p : fs.toZArray()) {
      final String s = p.toString(mBase);
      for (int k = 0; k < fs.getExponent(p); ++k) {
        sb.append(s);
      }
    }
    return new Z(sb, mBase);
  }

  void sequence(Z n) {
    long step = 0;
    while (true) {
      if (n.isProbablePrime()) {
        System.out.println(n);
        System.out.println("prime " + step);
        return;
      }
      final FactorSequence fs = AliquotSequence.getFactorSequence(n, mCheetah, mFactorizer);
      if (!fs.isComplete()) {
        final StringBuilder sb = new StringBuilder();
        for (final Z v : fs.toZArray()) {
          if (fs.getStatus(v) == FactorSequence.COMPOSITE || fs.getStatus(v) == FactorSequence.UNKNOWN) {
            if (sb.length() > 0) {
              sb.append(", ");
            }
            sb.append('C').append(v.toString().length());
          }
        }
        System.out.println("incomplete " + step + " " + sb.toString());
        return;
      }
      n = next(fs);
      ++step;
    }
  }

  /**
   * Main program.
   * @param args number to generate sequence for an optional base
   */
  public static void main(final String[] args) {
    if (args.length == 0) {
      System.err.println("Usage: HomePrimeSequence n [base]");
      return;
    }
    final Z n = ((LiteralZ) Sircon.parse(args[0]).eval()).value();
    final int base = args.length <= 1 ? 10 : Integer.parseInt(args[1]);
    final HomePrimeSequence hps = new HomePrimeSequence(base);
    System.out.println("Home prime sequence for: " + args[0]);
    hps.sequence(n);
  }

}

