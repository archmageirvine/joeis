package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;

/**
 * A069087 Numbers m such that (1/m)*Sum_{k=1..m} core(k) &gt; phi(m) where core(n) = A007913(n) is the squarefree part of n: the smallest number such that n*a(n) is a square and phi(n) = A000010(n) is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A069087 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069087() {
    super(1, 0, new A069891(), (n, k) -> k.compareTo(Functions.PHI.z(n).multiply(n)) > 0);
  }
}

