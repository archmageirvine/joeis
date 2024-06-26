package irvine.oeis.a113;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008352;

/**
 * A113773 Number of distinct prime factors of A008352.
 * @author Sean A. Irvine
 */
public class A113773 extends A008352 {

  /** Construct the sequence. */
  public A113773() {
    super(1);
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  {
    super.next(); // skip 0th term
  }

  @Override
  public Z next() {
    final Z n = super.next();
    if (mVerbose) {
      System.err.println("[" + n + "]");
    }
    return Z.valueOf(Functions.OMEGA.i(n));
  }
}

