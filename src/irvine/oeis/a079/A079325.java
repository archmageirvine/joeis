package irvine.oeis.a079;

import irvine.oeis.transform.AronsonTransform;

/**
 * A079325 a(n) is taken to be the smallest positive integer greater than a(n-1) which is consistent with the condition "n is a member of the sequence if and only if a(n) is a member of A079000".
 * @author Sean A. Irvine
 */
public class A079325 extends AronsonTransform {

  /** Construct the sequence. */
  public A079325() {
    super(new A079000());
  }
}
