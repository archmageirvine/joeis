package irvine.oeis.a204;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000265;
import irvine.oeis.a007.A007947;


/**
 * A204455 Squarefree product of all odd primes dividing n, and 1 if n is a power of 2: A099985/2.
 * Formula: <code>a(n) = A000265(A007947(n)).</code>
 * @author Georg Fischer
 */
public class A204455 extends NestedSequence {

  /** Construct the sequence. */
  public A204455() {
    super(1, new A000265(), new A007947(), 1, 1); 
  }

}
