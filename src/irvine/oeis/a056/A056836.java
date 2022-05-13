package irvine.oeis.a056;

import irvine.oeis.DistinctSequence;

/**
 * A056836 Distinct values of sequence obtained when LCM is applied to initial segments of sequence A024619 union {1}.
 * @author Sean A. Irvine
 */
public class A056836 extends DistinctSequence {

  /** Construct the sequence. */
  public A056836() {
    super(new A056835());
  }
}
