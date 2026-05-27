package irvine.oeis.a393;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a004.A004187;

/**
 * A393329 allocated for Alex Stokolos.
 * @author Sean A. Irvine
 */
public class A393329 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A393329() {
    super(0, new A004187());
  }
}
