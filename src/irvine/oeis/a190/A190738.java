package irvine.oeis.a190;
// Generated by gen_seq4.pl rectoproc/holos5 at 2022-08-12 18:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A190738 Central coefficients of the Riordan matrix A104259.
 * sumrecursion(binomial(2*n,n+k)*binomial(n+2*k,k)*(n+1)/(n+k+1),k,a(n));
 * @author Georg Fischer
 */
public class A190738 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A190738() {
    super(0, "[[0],[40500,-257700, 377600,-7900,-333300, 223600,-42800],[-7560, 44088,-64012,-9468, 81152,-56616, 11984],[1974,-13649, 25034,-5075,-24499, 21244,-5029],[0,-24,-530, 232, 1488,-1594, 428]]", "1, 4, 27, 212, 1785", 0);
  }
}
