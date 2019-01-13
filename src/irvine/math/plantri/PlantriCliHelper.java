package irvine.math.plantri;

import irvine.util.CliFlags;

/**
 * Command line parsing.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class PlantriCliHelper {

  private PlantriCliHelper() { }

  private static final String NO_OUTPUT_FLAG = "count-only";
  private static final String MIN_DEGREE_FLAG = "min-degree";
  private static final String PLANAR_FLAG = "planar";
  private static final String BIPARTITE_FLAG = "bipartite";
  private static final String OP_FLAG = "orientation";
  private static final String CONNECTIVITY_FLAG = "connectivity";
  private static final String QUADRANGULATIONS_FLAG = "quadrangulations";
  private static final String EXACT_FLAG = "exact";
  private static final String POLYGON_FLAG = "polygon";
  private static final String VERBOSE_FLAG = "verbose";
  private static final String RESIDUE_FLAG = "residue";
  private static final String FACES_FLAG = "faces";

  /* Decode the command line, setting the global variables which
     give the switch values.  Some basic checking is done too, but
     the most detailed checking is done later.  If an error is
     found, this procedure never returns.

     The values for numerical parameters (mMinConnec, mMinDegree,
     mEdgeBound[0..1], mMaxFaceSize, mPolygonSize are set as -1 if the
     parameter is not mentioned, 0 if it appears without an integer
     following, and the given integer value if there is one.  Negative
     values are not currently allowed.
  */
  static void decodeCommandLine(final Plantri plantri, final String... args) {
    final CliFlags flags = new CliFlags("Plantri", "Generate planar objects.");
    flags.registerOptional('u', NO_OUTPUT_FLAG, "do not output generated graphs, just count them");
    flags.registerOptional('o', OP_FLAG, "report orientation-preserving graphs");
    flags.registerOptional('p', PLANAR_FLAG, "generate planar graphs");
    flags.registerOptional('b', BIPARTITE_FLAG, "generate bipartite graphs");
    flags.registerOptional('q', QUADRANGULATIONS_FLAG, "generate quadrangulations");
    flags.registerOptional('x', EXACT_FLAG, "generate exact number of edges");
    flags.registerOptional('v', VERBOSE_FLAG, "report additional counts");
    flags.registerOptional('P', POLYGON_FLAG, Integer.class, "INTEGER", "size of polygon", -1);
    flags.registerOptional('m', MIN_DEGREE_FLAG, Integer.class, "INTEGER", "minimum number of edges", -1);
    flags.registerOptional('c', CONNECTIVITY_FLAG, Integer.class, "INTEGER", "minimum connectivity", -1);
    flags.registerOptional('f', FACES_FLAG, Integer.class, "INTEGER", "maximum size for a face", -1);
    flags.registerOptional(RESIDUE_FLAG, String.class, "INTEGER/INTEGER", "specify residue class to compute");
    flags.registerRequired(Integer.class, "n", "number of vertices");
    flags.setFlags(args);
    //outfilename = null;
    //sASwitch = false;
    //sGSwitch = false;
    //sSSwitch = false;
    //sBigESwitch = false;
    plantri.mBigGSwitch = false;
    //sHSwitch = false;
    plantri.mOuterPlanarSwitch = flags.isSet(OP_FLAG);
    //sDSwitch = false;
    plantri.mTSwitch = false;
    plantri.mCountSwitch = flags.isSet(NO_OUTPUT_FLAG);
    plantri.mVerbose |= flags.isSet(VERBOSE_FLAG);
    plantri.mExactSwitch = flags.isSet(EXACT_FLAG);
    plantri.mPolytopeSwitch = flags.isSet(PLANAR_FLAG);
    plantri.setBipartite(flags.isSet(BIPARTITE_FLAG));
    plantri.mQuadrangulationSwitch = flags.isSet(QUADRANGULATIONS_FLAG);
    //    zeroswitch = false;
    //    oneswitch = false;
    plantri.mTwoSwitch = false;
    plantri.mEdgeBound[0] = -1;
    plantri.mEdgeBound[1] = -1;
    plantri.mMaxFaceSize = (Integer) flags.getValue(FACES_FLAG);
    plantri.setPolygonSize((Integer) flags.getValue(POLYGON_FLAG));
    if (flags.isSet(RESIDUE_FLAG)) {
      final String[] residueSpec = ((String) flags.getValue(RESIDUE_FLAG)).split("/");
      if (residueSpec.length != 2) {
        throw new IllegalArgumentException("Bad residue specification: " + flags.getValue(RESIDUE_FLAG));
      }
      final int mod = Integer.parseInt(residueSpec[1]);
      plantri.setResMod(Integer.parseInt(residueSpec[0]) % mod, mod);
    } else {
      plantri.setResMod(0, 1);
    }

    plantri.setMinDegree((Integer) flags.getValue(MIN_DEGREE_FLAG));
    plantri.setMinConnectivity((Integer) flags.getValue(CONNECTIVITY_FLAG));

    plantri.mMaxNV = (Integer) flags.getAnonymousValue(0);
    if (plantri.mMaxNV < 1 || plantri.mMaxNV > Plantri.MAX_VERTICES) {
      throw new IllegalArgumentException("Number of vertices must be in range 1.." + Plantri.MAX_VERTICES);
    }

    //    for (i = 1; !badargs && i < argc; ++i)
    //    {
    //        arg = argv[i];
    //        if (arg[0] == '-' && arg[1] != '\0')
    //        {
    //        for (j = 1; arg[j] != '\0'; ++j)
    //            if (arg[j] == '\0') { }
    //            BOOLSWITCH('o',mOuterPlanarSwitch); // etc for each boolean flag
    //            INTSWITCH('f',mMaxFaceSize)
    //            INTSWITCH('P',mPolygonSize)
    //            else if (arg[j] == 'e')
    //            {
    //                CHECKSWITCH('e');
    //                getswitchvaluelist(arg,&j,mEdgeBound,delims,2,&numbounds,":-");
    //                if (numbounds == 1) mEdgeBound[1] = mEdgeBound[0];
    //                if (mEdgeBound[1] == 0) mEdgeBound[1] = MAX_EDGES/2;
    //            }
    //            else
    //            {
    //                CHECKSWITCH(arg[j]);
    //                badargs = true;
    //            }
    //        }
    //        else if (argsgot >= 3)
    //            badargs = true;
    //        else if (argsgot == 0)
    //        {
    //            j = -1;
    //            mMaxNV = getswitchvalue(arg,&j);
    //            if (arg[j+1] == 'd' && arg[j+2] == '\0')
    //                if (mMaxNV & 1)
    //                {
    //                    fprintf(stderr,">E %s: n with 'd' must be even\n",cmdname);
    //                    exit(1);
    //                }
    //                else  mMaxNV = mMaxNV / 2 + 2;
    //            else if (arg[j+1] != '\0')
    //                badargs = true;
    //            ++argsgot;
    //        }
    //        else
    //        {
    //            if (arg[0] == '-')
    //            {
    //                if (argsgot == 0) badargs = true;
    //            }
    //            else if (sscanf(arg,"%d/%d",&ares,&amod) == 2)
    //            {
    //                mRes = ares;
    //                mMod = amod;
    //            }
    //            else
    //                outfilename = arg;
    //            ++argsgot;
    //        }
    //    }

    //    if (argsgot == 0) badargs = true;
    //
    //    if (badargs)
    //    {
    //        fprintf(stderr,
    //            ">E Usage: %s %s n [mRes/mMod] [outfile]\n",cmdname,SWITCHES);
    //        exit(1);
    //    }
    //
    //    if (mRes < 0 || mRes >= mMod)
    //    {
    //        fprintf(stderr,">E %s: must have 0 <= mRes < mMod\n",cmdname);
    //        exit(1);
    //    }

    if (plantri.mOuterPlanarSwitch /*|| sBigVSwitch || oneswitch*/) {
      plantri.mBigGSwitch = true;
    }
    //    if (oneswitch) zeroswitch = true;
  }
}
