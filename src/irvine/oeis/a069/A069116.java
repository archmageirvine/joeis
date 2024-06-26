package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A069116 Composite k such that the squarefree part of k is greater than sqrt(k).
 * @author Sean A. Irvine
 */
public class A069116 extends FilterSequence {

  /** Construct the sequence. */
  public A069116() {
    super(1, new A002808(), k -> Functions.CORE.z(k).square().compareTo(k) > 0);
  }
}

