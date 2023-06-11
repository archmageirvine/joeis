package irvine.oeis.a064;

/**
 * A064067 n-th step is to add a(n) to each previous number a(k) (excluding itself, i.e., k &lt; n) to produce n more terms of the sequence, starting with a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A064067 extends A064065 {

  /** Construct the sequence. */
  public A064067() {
    super(1, 2);
  }
}
