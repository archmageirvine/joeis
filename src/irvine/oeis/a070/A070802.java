package irvine.oeis.a070;

import irvine.oeis.Combiner;

/**
 * A070802 a(n)=prevprime[sigma(n)]-nextprime[phi(n)]=A070801(n)-A070800(n).
 * @author Sean A. Irvine
 */
public class A070802 extends Combiner {

  /** Construct the sequence. */
  public A070802() {
    super(2, new A070801(), new A070800(), SUBTRACT);
  }
}
