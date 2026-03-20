package irvine.oeis.a392;

import irvine.oeis.InverseSequence;
import irvine.oeis.a393.A393958;

/**
 * A392563 a(n) is the least number that can be written in exactly n ways as p + r, where p is a prime and r is an anagram of p.
 * @author Sean A. Irvine
 */
public class A392563 extends InverseSequence {

  /** Construct the sequence. */
  public A392563() {
    super(0, 0, new A393958());
  }
}

