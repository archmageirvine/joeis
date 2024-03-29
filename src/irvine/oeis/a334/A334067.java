package irvine.oeis.a334;
// Generated by gen_seq4.pl build/parmof4 at 2022-06-08 20:52

import irvine.oeis.a079.A079000;

/**
 * A334067 a(n) is taken to be the smallest positive integer greater than a(n-1) which is consistent with the condition "n is a term of the sequence if and only if a(n) is prime" where indices start from 0.
 * @author Georg Fischer
 */
public class A334067 extends A079000 {

  /** Construct the sequence. */
  public A334067() {
    super(0, 1, 1, n -> n.isProbablePrime());
  }
}
