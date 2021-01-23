package irvine.oeis.a242;

import irvine.oeis.FiniteSequence;

/**
 * A242809 a(n) is the largest n-digit number whose truncation after its first k digits is divisible by the k-th Fibonacci number for k = 1..n.
 * @author Georg Fischer
 */
public class A242809 extends FiniteSequence {

  /** Construct the sequence. */
  public A242809() {
    super(9, 99, 998, 9987, 99875, 998752, 9987523, 99840006, 994552020L, 9945520200L, 95880078250L);
  }
}
