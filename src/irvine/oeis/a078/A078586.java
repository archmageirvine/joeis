package irvine.oeis.a078;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a002.A002145;

/**
 * A078586 a(n) is the product of the first n primes of the form 4k+3.
 * @author Sean A. Irvine
 */
public class A078586 extends PartialProductSequence {

  /** Construct the sequence. */
  public A078586() {
    super(1, new A002145());
  }
}

