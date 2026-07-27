package irvine.oeis.a131;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A131803 A binary Major Minor chord substitution: Chord progression start vector {4, 11, 9, 2, 5, 7} Cmajor, Gminor,Fminor,BbMajor,Dbminor, Ebminor.
 * @author Sean A. Irvine
 */
public class A131803 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A131803() {
    super(1, "4B9257", "4", "1->148B, 2->2691, 3->36A1, 4->48B3, 5->58C3, 6->6A15, 7->7A25, 8->8C37, 9->9C47, A->A259, B->B469, C->C47B");
  }
}
