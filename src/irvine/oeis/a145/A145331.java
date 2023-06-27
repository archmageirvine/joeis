package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145331 Numbers X such that there exists Y in N : X^2=129*Y^2+43.
 * @author Sean A. Irvine
 */
public class A145331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145331() {
    super(1, new long[] {-1, 33710}, new long[] {602, 20292818});
  }
}
