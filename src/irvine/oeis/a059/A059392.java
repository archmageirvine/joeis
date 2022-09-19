package irvine.oeis.a059;

/**
 * A059392 a(1)=1; a(n) is a k(n)-almost prime; m is an A-almost prime (for 1&lt;=A); a(n) = smallest number m&gt;a(n-1) such that a(i)+m is an (abs[ A-k(i) ])-almost prime for i = 1,2,3,..,n-1.
 * @author Sean A. Irvine
 */
public class A059392 extends A059391 {

  /** Construct the sequence. */
  public A059392() {
    super(1);
  }
}
