package irvine.oeis.a031;

/**
 * A031259 a(n)=least k such that base 5 representation of n begins at s(k), where s=A031253.
 * @author Sean A. Irvine
 */
public class A031259 extends A031225 {

  /** Construct the sequence. */
  public A031259() {
    super(new A031253(), 0);
  }
}

