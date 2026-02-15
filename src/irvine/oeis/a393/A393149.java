package irvine.oeis.a393;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a035.A035137;
import irvine.oeis.a084.A084843;

/**
 * A393149 Numbers that cannot be represented as a sum or difference of two palindromes.
 * @author Sean A. Irvine
 */
public class A393149 extends IntersectionSequence {

  /** Construct the sequence. */
  public A393149() {
    super(new A084843(), new A035137());
  }
}

