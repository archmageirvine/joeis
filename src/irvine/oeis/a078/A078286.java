package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078286 Least nontrivial multiple of the n-th prime beginning with 2.
 * @author Sean A. Irvine
 */
public class A078286 extends A000040 {

  private final String mPrefix;

  protected A078286(final String prefix) {
    mPrefix = prefix;
  }

  /** Construct the sequence. */
  public A078286() {
    this("2");
  }

  @Override
  public Z next() {
    final Z p = super.next();
    Z t = p;
    while (true) {
      t = t.add(p);
      if (t.toString().startsWith(mPrefix)) {
        return t;
      }
    }
  }
}

