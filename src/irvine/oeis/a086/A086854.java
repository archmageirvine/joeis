package irvine.oeis.a086;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A086854 Number of permutations of length n with exactly 3 rising or falling successions.
 * @author Georg Fischer
 */
public class A086854 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A086854() {
    super(0, "[[0],[6504,-21204,29062,-21963,10044,-2856,495,-48,2],[-24660,71276,-84835,54789,-21144,5025,-723,58,-2],[-30900,92312,-106105,64575,-23430,5289,-735,58,-2],[-26664,7294,36007,-38841,18222,-4737,711,-58,2],[40968,-73150,54687,-22284,5364,-765,60,-2]]", "0,0,0,0,2", 0);
  }
}
