package irvine.oeis.a115;

import irvine.oeis.FiniteSequence;

/**
 * A115595 The sequence 11,0,1,3333,2,3,5555,4,5,7777,6,7,9999,9,0,2222,1,2,4444,3,4,6666,5,6,8888,7,9,11 has three subsequences that have interesting patterns inside it. Namely, 11,0,(1),3333,2,(3),5555,4,(5),7777,6,(7),9999,9,(0),2222,1,(2),4444,3,(4),6666,5,(6),8888,7,(9),11.
 * @author Sean A. Irvine
 */
public class A115595 extends FiniteSequence {

  /** Construct the sequence. */
  public A115595() {
    super(1, FINITE, 11, 0, 1, 3333, 2, 3, 5555, 4, 5, 7777, 6, 7, 9999, 9, 0, 2222, 1, 2, 4444, 3, 4, 6666, 5, 6, 8888, 7, 9, 11);
  }
}

