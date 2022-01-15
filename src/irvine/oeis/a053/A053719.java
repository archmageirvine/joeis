package irvine.oeis.a053;

import irvine.oeis.a000.A000330;

/**
 * A053719 Let Py(n)=A000330(n)=n-th square pyramidal number. Consider all integer triples (i,j,k), j &gt;= k&gt;0, with Py(i)=Py(j)+Py(k), ordered by increasing i; sequence gives i values.
 * @author Sean A. Irvine
 */
public class A053719 extends A053676 {

  /** Construct the sequence. */
  public A053719() {
    super(new A000330());
  }
}

