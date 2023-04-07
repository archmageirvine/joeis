package irvine.oeis.a357;
// manually 2023-04-03

import irvine.oeis.a050.A050449;

/**
 * A357912 a(n) = Sum_{d|n, d==1 (mod 11)} d.
 * @author Georg Fischer
 */
public class A357912 extends A050449 {

  /** Construct the sequence. */
  public A357912() {
    super(1, 1, 11);
  }
}
