package irvine.oeis.a110;

import irvine.oeis.FiniteSequence;

/**
 * A110186 Strongly rounded Renard series R"20 of preferred numbers based on 10^(1/20).
 * @author Georg Fischer
 */
public class A110186 extends FiniteSequence {

  /** Construct the sequence. */
  public A110186() {
    super(10, 11, 12, 14, 16, 18, 20, 22, 25, 28, 30, 35, 40, 45, 50, 55, 60, 70, 80, 90, 100);
  }
}
