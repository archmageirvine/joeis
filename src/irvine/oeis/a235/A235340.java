package irvine.oeis.a235;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A235340 a(n) = 10*binomial(11*n+10,n)/(11*n+10).
 * @author Georg Fischer
 */
public class A235340 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A235340() {
    super(0, "[[0],[3991680, 80307216, 194491044,-6574101820,-73174327105,-365033687172,-1048858004733,-1839199198980,-1945306845075,-1141246682444,-285311670611],[3628800, 106286400, 1275357600, 8409500000, 34169300000, 90205500000, 157773000000, 181500000000, 132000000000, 55000000000, 10000000000]]", "[1, 10]", 0);
  }
}
