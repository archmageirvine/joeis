package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313909 Coordination sequence Gal.6.648.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313909 extends TilingSequence {

  /** Construct the sequence. */
  public A313909() {
    super(0, new String[]
        { "4.4.3.3.3;B0+3,A180+2,C0+1,A180+4,C180+5"
        , "4.4.3.3.3;D90+2,C180+2,A0+1,C180+4,E180+5"
        , "4.4.3.3.3;A0+3,B180+2,E0+1,B180+4,A180+5"
        , "4.3.4.3.3;E90+2,B270+1,E90+4,F270+3,F60-5"
        , "4.3.4.3.3;C0+3,D270+1,F330-1,D270+3,B180+5"
        , "4.3.4.3.3;E330-3,F150-4,D90+4,F150-2,D60-5"
        });
    defineBaseSet(0);
  }
}
