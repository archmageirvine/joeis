package irvine.oeis.a031;

/**
 * A031110 a(n)=least k such that base 9 representation of n begins at s(k), where s=A031100.
 * @author Sean A. Irvine
 */
public class A031110 extends A031086 {

  /** Construct the sequence. */
  public A031110() {
    super(new A031100(), 0);
  }
}

