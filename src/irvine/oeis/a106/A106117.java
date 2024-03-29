package irvine.oeis.a106;
// Generated by gen_seq4.pl morfps19/morfps at 2024-03-20 21:20

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A106117 Substitution sequence that simulates a three level two state neural net in six symbols : Fibonacci-Silver Chain-Fibonacci.
 * @author Georg Fischer
 */
public class A106117 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A106117() {
    super(0, "3", "tri", "1->3, 2->34, 3->565, 4->5, 5->1, 6->12");
  }
}
