package irvine.oeis.a085;

import irvine.oeis.a000.A000035;
import irvine.oeis.a057.A057979;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A085791 Triangle T(n,k) read by rows; given by [0,1,0,1,0,1,0,1,...] DELTA [1,0,1,1,1,2,1,3,1,4,1,5,...], where DELTA is the operator defined in A084938.
 * @author Sean A. Irvine
 */
public class A085791 extends DelehamDeltaSequence {

  /** Construct the sequence. */
  public A085791() {
    super(new A000035(), new A057979());
  }
}
