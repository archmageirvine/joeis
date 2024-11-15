package irvine.oeis.a080;

import irvine.oeis.a000.A000045;
import irvine.oeis.transform.InverseAronsonTransformSequence;

/**
 * A080745 Inverse Aronson transform of Fibonacci numbers 1,2,3,5,8,13,...
 * @author Sean A. Irvine
 */
public class A080745 extends InverseAronsonTransformSequence {

  /** Construct the sequence. */
  public A080745() {
    super(1, new A000045().skip(2));
  }
}

