package irvine.oeis.a393;

import irvine.oeis.a241.A241773;
import irvine.oeis.a390.A390737;

/**
 * A393695 Number of decimal places which are known after using n terms of A241773 and treating them as the coefficients of a continued fraction.
 * @author Sean A. Irvine
 */
public class A393695 extends A390737 {

  /** Construct the sequence. */
  public A393695() {
    super(new A241773().prepend(0));
  }
}
