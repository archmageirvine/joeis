package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A393322 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A393322 extends FilterSequence {

  /** Construct the sequence. */
  public A393322() {
    super(1, new A000040(), (n, p) -> Functions.REVERSE.z(p).equals(Functions.PRIME.z(Functions.REVERSE.l(n))));
  }
}

