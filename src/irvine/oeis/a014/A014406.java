package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014406 Number of strictly increasing arithmetic progressions of <code>&gt;= 3</code> terms with sum <code>&lt;=</code> n.
 * @author Sean A. Irvine
 */
public class A014406 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014406() {
    super(new A014405());
  }
}
