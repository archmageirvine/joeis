package irvine.oeis.a189;
// manually A189011 at 2021-09-17 17:10

import irvine.oeis.a002.A002061;
import irvine.oeis.a135.A135668;

/**
 * A189135 Zero-one sequence based on the central polygonal numbers n^2-n+1:  a(A002061(k))=a(k); a(A135668(k))=1-a(k), a(1)=0.
 * @author Georg Fischer
 */
public class A189135 extends A189011 {

  /** Construct the sequence. */
  public A189135() {
    super(0, 1, new A002061(), new A135668(), 0);
    mU = mSeqU.next().intValue(); // starts with 1, 1, 3 - not monotone
  }
}
