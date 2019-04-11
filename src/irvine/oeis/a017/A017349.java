package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017349 <code>a(n) = (10*n + 6)^9</code>.
 * @author Sean A. Irvine
 */
public class A017349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017349() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {10077696, 68719476736L, 5429503678976L, 101559956668416L, 922190162669056L, 5416169448144896L, 23762680013799936L, 84590643846578176L, 257327417311663616L, 692533995824480256L});
  }
}
