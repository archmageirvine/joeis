package irvine.oeis.a046;

import irvine.oeis.RecordSequence;
import irvine.oeis.a000.A000001;

/**
 * A046058 Incrementally largest numbers of nonisomorphic finite groups of order n.
 * @author Sean A. Irvine
 */
public class A046058 extends RecordSequence {

  /** Construct the sequence. */
  public A046058() {
    super(1, new A000001().skip());
  }
}

