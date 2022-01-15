package irvine.oeis.a053;

import irvine.oeis.a000.A000330;

/**
 * A053720 Let Py(n)=A000330(n)=n-th square pyramidal number. Consider all integer triples (i,j,k), j &gt;= k&gt;0, with Py(i)=Py(j)+Py(k), ordered by increasing i; sequence gives j values.
 * @author Sean A. Irvine
 */
public class A053720 extends A053677 {

  /** Construct the sequence. */
  public A053720() {
    super(new A000330());
  }
}

