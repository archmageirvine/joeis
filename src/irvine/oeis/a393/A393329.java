package irvine.oeis.a393;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a004.A004187;

/**
 * A393329 Self-convolution of the sequence b(n) = A004187(n) = F(4*n)/3, where F(n) are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A393329 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A393329() {
    super(0, new A004187());
  }
}
