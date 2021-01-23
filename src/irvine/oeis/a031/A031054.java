package irvine.oeis.a031;

/**
 * A031054 a(n)=least k such that base 8 representation of n begins at s(k), where s=A031045.
 * @author Sean A. Irvine
 */
public class A031054 extends A031044 {

  /** Construct the sequence. */
  public A031054() {
    super(new A031045(), -1);
  }
}

