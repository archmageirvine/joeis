package irvine.oeis.a053;

import irvine.oeis.a000.A000330;

/**
 * A053721 Let Py(n)=A000330(n)=n-th square pyramidal number. Consider all integer triples (i,j,k), j &gt;= k&gt;0, with Py(i)=Py(j)+Py(k), ordered by increasing i; sequence gives k values.
 * @author Sean A. Irvine
 */
public class A053721 extends A053678 {

  /** Construct the sequence. */
  public A053721() {
    super(new A000330());
  }
}

