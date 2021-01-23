package irvine.oeis.a031;

/**
 * A031015 a(n)=least k such that base 7 representation of n begins at s(k), where s=A031007.
 * @author Sean A. Irvine
 */
public class A031015 extends A031006 {

  /** Construct the sequence. */
  public A031015() {
    super(new A031007(), -1);
  }
}

