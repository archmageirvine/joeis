package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017152 <code>a(n) = (8*n + 7)^4</code>.
 * @author Sean A. Irvine
 */
public class A017152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017152() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2401, 50625, 279841, 923521, 2313441});
  }
}
