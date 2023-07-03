package irvine.oeis.a046;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a000.A000688;

/**
 * A046055 Orders of finite Abelian groups having the incrementally largest numbers of nonisomorphic forms (A046054).
 * @author Sean A. Irvine
 */
public class A046055 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A046055() {
    super(1, new A000688(), 1);
  }
}
