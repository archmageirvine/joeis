package irvine.oeis.a051;

import irvine.oeis.PrependSequence;
import irvine.oeis.a123.A123568;

/**
 * A051200 Except for initial term, primes of form "n 3's followed by 1".
 * @author Sean A. Irvine
 */
public class A051200 extends PrependSequence {

  /** Construct the sequence. */
  public A051200() {
    super(new A123568(), 3);
  }
}
