package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313039 Coordination sequence Gal.5.216.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313039 extends TilingSequence {

  /** Construct the sequence. */
  public A313039() {
    super(0, new String[]
        { "6.4.3.4;A60+2,A300+1,B30+1,B90-1"
        , "4.3.4.3.3;A330+3,B0-2,C120+3,D270+3,B60-5"
        , "6.4.3.4;E60+2,E300+1,B240+3,B240-3"
        , "4.3.4.3.3;E330+3,B150-4,B90+4,E150+4,D180+5"
        , "6.4.3.4;C60+2,C300+1,D30+1,D210+4"
        });
    defineBaseSet(0);
  }
}
