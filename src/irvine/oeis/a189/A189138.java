package irvine.oeis.a189;
// manually A189011 at 2021-09-17 17:10

import irvine.oeis.a002.A002522;
import irvine.oeis.a164.A164386;

/**
 * A189138 Zero-one sequence based on the sequence 1+n^2:  a(A002522(k))=a(k); a(A164386(k))=1-a(k), a(1)=0.
 * @author Georg Fischer
 */
public class A189138 extends A189011 {

  /** Construct the sequence. */
  public A189138() {
    super(0, 1, new A002522(), new A164386(), 1);
    mU = mSeqU.next().intValue();
    mKu = 1;
  }
}
