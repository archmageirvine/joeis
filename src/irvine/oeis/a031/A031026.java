package irvine.oeis.a031;

/**
 * A031026 a(n)=least k such that the base 7 representation of n begins at s(k), where s=A031018.
 * @author Sean A. Irvine
 */
public class A031026 extends A031006 {

  /** Construct the sequence. */
  public A031026() {
    super(new A031018(), 0);
  }
}

