package irvine.oeis.a031;

/**
 * A031099 a(n)=least k such that base 9 representation of n begins at s(k), where s=A031098.
 * @author Sean A. Irvine
 */
public class A031099 extends A031086 {

  /** Construct the sequence. */
  public A031099() {
    super(new A031098(), 0);
  }
}

