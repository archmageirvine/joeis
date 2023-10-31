package irvine.oeis.a364;
// manually at 2023-10-30

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A364244 a(n) = A143007(2*n-1, n-1) for n &gt;= 1.
 * a(n) = sum(k=0,n-1,binom(2*n-1,k)^2 * binom(3*n-2-k,2*n-1)^2)
 * @author Georg Fischer
 */
public class A364244 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A364244() {
    super(1, "[[0],[54000,-432648,1497924,-2937670,3596364,-2853540,1470168,-475248,87648,-7040],[-2745998,23447876,-87271191,185709390,-249018285,218361816,-125359294,45492136,-9481824,865920],[3974,-42966,200298,-528046,867552,-921732,633928,-272496,66528,-7040]]", "1,25", 0);

  }
}
