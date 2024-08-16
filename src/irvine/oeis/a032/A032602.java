package irvine.oeis.a032;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000959;

/**
 * A032602 a(n) = n-th prime number + n-th lucky number.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A032602 extends Combiner {

  /** Construct the sequence. */
  public A032602(){
    super(1, new A000040(), new A000959(), ADD);
  }
}
