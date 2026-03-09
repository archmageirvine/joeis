package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A393816 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A393816 extends FilterSequence {

  /** Construct the sequence. */
  public A393816() {
    super(1, new A052486(), k -> Functions.OMEGA.i(k) == 2);
  }
}

