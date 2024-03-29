package irvine.oeis.a050;
// Generated by gen_seq4.pl holos [[0],[548,4484,14592,23968,20800,9024,1536],[-31030,-172598,-388698,-453428,-289600,-96288,-13056],[552,2780,5550,5613,3052,852,96]] [1,14,786] 2 at 2020-02-15 22:07
// Recurrence: 4*(n+1)*(2*n+1)^3*(48*n^2+162*n+137)*a[n+0]+(n+2)^3*(2*n+3)*(48*n^2+66*n+23)*a[n+2]=2*(4*(n+1)^2*(2*n+3)^2*(408*n^2+969*n+431)-(n+1)*(2*n+3)*(69*n+31)+57*n+92)*a[n+1]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A050983 de Bruijn's S(4,n).
 * @author Georg Fischer
 */
public class A050983 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A050983() {
    super(0, "[[0],[548,4484,14592,23968,20800,9024,1536],[-31030,-172598,-388698,-453428,-289600,-96288,-13056],[552,2780,5550,5613,3052,852,96]]", "[1,14,786]", 2);
  }
}
