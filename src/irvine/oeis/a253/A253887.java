package irvine.oeis.a253;

import irvine.math.z.Z;
import irvine.oeis.recur.GeneralRecurrence;

/**
 * A253887 Row index of n in A191450: a(3n) = 2n, a(3n+1) = 2n+1, a(3n+2) = a(n+1).
 * @author Georg Fischer
 */
public class A253887 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A253887() {
    super(1, 1, 1, 2);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> Z.valueOf(2 * n));
    mLambda.add(n -> Z.valueOf(2 * n + 1));
    mLambda.add(n -> a(n + 1));
  }
}
